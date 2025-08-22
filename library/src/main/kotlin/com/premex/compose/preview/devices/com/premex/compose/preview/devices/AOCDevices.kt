package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AOC device specifications for Android Compose previews.
 *
 * This extension provides AOC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AOC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AOC: Any
  get() = object {
      /** DeviceSpec(manufacturer=AOC, code=A110_E, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=A110_E, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val A110_E = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AOC, code=AOC_WW, width=672, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=AOC_WW, width=672,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val AOC_WW = "spec:width=672,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=AOC, code=hongkong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=hongkong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AOC, code=khardi, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=khardi, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val KHARDI = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AOC, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=mountbaker, width=720,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AOC, code=PH0M_EA_T32, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=PH0M_EA_T32, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PH0M_EA_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AOC, code=PH3M_AL_T32, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=PH3M_AL_T32, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val PH3M_AL_T32 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=AOC, code=Q10107LW-ME, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=Q10107LW-ME, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val Q10107LW_ME = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AOC, code=Q10107L-ME, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=Q10107L-ME, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val Q10107L_ME = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=AOC, code=Q8108L-ME, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=Q8108L-ME, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val Q8108L_ME = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=AOC, code=wulong, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=AOC, code=wulong, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val WULONG = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
