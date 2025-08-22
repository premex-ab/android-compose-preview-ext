package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Jinga device specifications for Android Compose previews.
 *
 * This extension provides Jinga device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jinga.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jinga: Any
  get() = object {
      /** DeviceSpec(manufacturer=Jinga, code=GoalPlus, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jinga, code=GoalPlus, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val GOALPLUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Jinga, code=Hit4G, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jinga, code=Hit4G, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val HIT4G = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Jinga, code=JI55AG_189ID, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jinga, code=JI55AG_189ID,
      width=480, height=960, dpi=240, isGoogleDevice=false).code */
      val JI55AG_189ID = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Jinga, code=Neon, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jinga, code=Neon, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val NEON = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Jinga, code=PicassoNote, width=480, height=996, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jinga, code=PicassoNote, width=480,
      height=996, dpi=240, isGoogleDevice=false).code */
      val PICASSONOTE = "spec:width=480,height=996,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=Jinga, code=Touch4G, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jinga, code=Touch4G, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val TOUCH4G = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=Jinga, code=WinPRO, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Jinga, code=WinPRO, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val WINPRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
