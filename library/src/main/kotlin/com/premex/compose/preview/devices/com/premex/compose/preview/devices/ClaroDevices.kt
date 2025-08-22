package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Claro device specifications for Android Compose previews.
 *
 * This extension provides Claro device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Claro.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Claro: Any
  get() = object {
      /** DeviceSpec(manufacturer=Claro, code=B866V2_V1_0_0, width=1080, height=1920, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Claro, code=B866V2_V1_0_0,
      width=1080, height=1920, dpi=213, isGoogleDevice=false).code */
      val B866V2_V1_0_0 = "spec:width=1080,height=1920,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Claro, code=claro_vsb3918, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Claro, code=claro_vsb3918,
      width=1080, height=1920, dpi=320, isGoogleDevice=false).code */
      val CLARO_VSB3918 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Claro, code=SEI700CPR, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Claro, code=SEI700CPR, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI700CPR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Claro, code=SEI800CCOA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Claro, code=SEI800CCOA, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI800CCOA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Claro, code=SEI810CCOA, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Claro, code=SEI810CCOA, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI810CCOA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Claro, code=SEI810CPR, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Claro, code=SEI810CPR, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SEI810CPR = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Claro, code=SEI900CCOAS, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Claro, code=SEI900CCOAS, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SEI900CCOAS = "spec:width=720,height=1280,unit=px,dpi=320"

  }
