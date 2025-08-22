package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QCELL device specifications for Android Compose previews.
 *
 * This extension provides QCELL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QCELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QCELL: Any
  get() = object {
      /** QCELL QSmart */
      val QSMART = "spec:width=480,height=960,unit=px,dpi=200"

      /** QCELL QSmart_Plus */
      val QSMART_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

  }
