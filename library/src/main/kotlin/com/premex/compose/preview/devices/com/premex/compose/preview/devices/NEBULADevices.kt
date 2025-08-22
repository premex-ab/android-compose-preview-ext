package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEBULA device specifications for Android Compose previews.
 *
 * This extension provides NEBULA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NEBULA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NEBULA: Any
  get() = object {
      /** DeviceSpec(manufacturer=NEBULA, code=CJU, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEBULA, code=CJU, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val CJU = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEBULA, code=D2140-Cosmos, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEBULA, code=D2140-Cosmos,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val D2140_COSMOS = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEBULA, code=DM8260, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEBULA, code=DM8260, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DM8260 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=NEBULA, code=DM8261, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=NEBULA, code=DM8261, width=1080,
      height=1920, dpi=213, isGoogleDevice=false).code */
      val DM8261 = "spec:width=1080,height=1920,unit=px,dpi=213"

  }
