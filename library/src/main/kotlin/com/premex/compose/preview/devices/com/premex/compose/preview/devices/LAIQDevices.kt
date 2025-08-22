package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAIQ device specifications for Android Compose previews.
 *
 * This extension provides LAIQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LAIQ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LAIQ: Any
  get() = object {
      /** DeviceSpec(manufacturer=LAIQ, code=LAIQ_Glam, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAIQ, code=LAIQ_Glam, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val LAIQ_GLAM = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=LAIQ, code=STARTRAIL, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=LAIQ, code=STARTRAIL, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val STARTRAIL = "spec:width=720,height=1280,unit=px,dpi=320"

  }
