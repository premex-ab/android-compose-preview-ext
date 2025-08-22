package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * benzo device specifications for Android Compose previews.
 *
 * This extension provides benzo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Benzo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Benzo: Any
  get() = object {
      /** DeviceSpec(manufacturer=benzo, code=Class_C250, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=benzo, code=Class_C250, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val CLASS_C250 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
