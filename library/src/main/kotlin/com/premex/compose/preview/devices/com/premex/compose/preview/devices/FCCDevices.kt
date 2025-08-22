package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FCC device specifications for Android Compose previews.
 *
 * This extension provides FCC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FCC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FCC: Any
  get() = object {
      /** DeviceSpec(manufacturer=FCC, code=GK738_3G, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCC, code=GK738_3G, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK738_3G = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=FCC, code=GK788, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FCC, code=GK788, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val GK788 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
