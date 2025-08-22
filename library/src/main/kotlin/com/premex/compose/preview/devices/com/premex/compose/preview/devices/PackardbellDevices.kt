package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * packard_bell device specifications for Android Compose previews.
 *
 * This extension provides packard_bell device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Packardbell.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Packardbell: Any
  get() = object {
      /** DeviceSpec(manufacturer=packard_bell, code=BL_9UEEP_104, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=packard_bell, code=BL_9UEEP_104,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val BL_9UEEP_104 = "spec:width=720,height=1560,unit=px,dpi=320"

  }
