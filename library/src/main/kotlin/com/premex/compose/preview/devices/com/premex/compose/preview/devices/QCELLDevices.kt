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
      /** DeviceSpec(manufacturer=QCELL, code=QSmart, width=480, height=960, dpi=200,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QCELL, code=QSmart, width=480,
      height=960, dpi=200, isGoogleDevice=false).code */
      val QSMART = "spec:width=480,height=960,unit=px,dpi=200"

      /** DeviceSpec(manufacturer=QCELL, code=QSmart_Plus, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=QCELL, code=QSmart_Plus, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val QSMART_PLUS = "spec:width=720,height=1600,unit=px,dpi=320"

  }
