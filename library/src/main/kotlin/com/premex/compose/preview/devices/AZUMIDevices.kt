package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AZUMI device specifications for Android Compose previews.
 *
 * This extension provides AZUMI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AZUMI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AZUMI: Any
  get() = object {
      /** AZUMI AZUMI_V5_AC01 */
      val AZUMI_V5_AC01 = "spec:width=480,height=854,unit=px,dpi=240"

      /** AZUMI NOBU_A55_PRO */
      val NOBU_A55_PRO = "spec:width=442,height=960,unit=px,dpi=213"

  }
