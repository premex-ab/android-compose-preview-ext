package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Hannspree device specifications for Android Compose previews.
 *
 * This extension provides Hannspree device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hannspree.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hannspree: Any
  get() = object {
      /** DeviceSpec(manufacturer=Hannspree, code=HANNSPAD, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hannspree, code=HANNSPAD,
      width=1080, height=1920, dpi=240, isGoogleDevice=false).code */
      val HANNSPAD = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Hannspree, code=HannspadPro, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hannspree, code=HannspadPro,
      width=800, height=1280, dpi=213, isGoogleDevice=false).code */
      val HANNSPADPRO = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=Hannspree, code=HSG1415, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hannspree, code=HSG1415, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HSG1415 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hannspree, code=mid1024_e, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hannspree, code=mid1024_e,
      width=800, height=1280, dpi=160, isGoogleDevice=false).code */
      val MID1024_E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=Hannspree, code=rk3368_32, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Hannspree, code=rk3368_32,
      width=1080, height=1920, dpi=160, isGoogleDevice=false).code */
      val RK3368_32 = "spec:width=1080,height=1920,unit=px,dpi=160"

  }
