package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MEO device specifications for Android Compose previews.
 *
 * This extension provides MEO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.MEO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.MEO: Any
  get() = object {
      /** DeviceSpec(manufacturer=MEO, code=DIW377-MEO, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEO, code=DIW377-MEO, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW377_MEO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEO, code=DIW3930-MEO, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEO, code=DIW3930-MEO, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DIW3930_MEO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEO, code=DV8555-MEO, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEO, code=DV8555-MEO, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val DV8555_MEO = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=MEO, code=DV8985-MEO, width=576, height=720, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=MEO, code=DV8985-MEO, width=576,
      height=720, dpi=320, isGoogleDevice=false).code */
      val DV8985_MEO = "spec:width=576,height=720,unit=px,dpi=320"

  }
