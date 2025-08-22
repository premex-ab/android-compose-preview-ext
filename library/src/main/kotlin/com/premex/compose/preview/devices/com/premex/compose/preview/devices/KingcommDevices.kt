package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kingcomm device specifications for Android Compose previews.
 *
 * This extension provides Kingcomm device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kingcomm.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kingcomm: Any
  get() = object {
      /** DeviceSpec(manufacturer=Kingcomm, code=C500, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Kingcomm, code=C500, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val C500 = "spec:width=480,height=960,unit=px,dpi=240"

  }
