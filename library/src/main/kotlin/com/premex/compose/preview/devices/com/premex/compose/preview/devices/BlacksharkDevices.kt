package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * blackshark device specifications for Android Compose previews.
 *
 * This extension provides blackshark device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Blackshark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Blackshark: Any
  get() = object {
      /** DeviceSpec(manufacturer=blackshark, code=bullhead, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=bullhead,
      width=1080, height=1920, dpi=480, isGoogleDevice=false).code */
      val BULLHEAD = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=blackshark, code=darklighter, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=darklighter,
      width=1080, height=2340, dpi=440, isGoogleDevice=false).code */
      val DARKLIGHTER = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=blackshark, code=kaiser, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=kaiser, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val KAISER = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=blackshark, code=kaiser-os, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=kaiser-os,
      width=1080, height=2400, dpi=440, isGoogleDevice=false).code */
      val KAISER_OS = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=blackshark, code=klein, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=klein, width=1080,
      height=2400, dpi=440, isGoogleDevice=false).code */
      val KLEIN = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=blackshark, code=mobius, width=1440, height=3120, dpi=560,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=mobius,
      width=1440, height=3120, dpi=560, isGoogleDevice=false).code */
      val MOBIUS = "spec:width=1440,height=3120,unit=px,dpi=560"

      /** DeviceSpec(manufacturer=blackshark, code=penrose, width=1080, height=2400, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=penrose,
      width=1080, height=2400, dpi=440, isGoogleDevice=false).code */
      val PENROSE = "spec:width=1080,height=2400,unit=px,dpi=440"

      /** DeviceSpec(manufacturer=blackshark, code=shark, width=1080, height=2160, dpi=420,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=shark, width=1080,
      height=2160, dpi=420, isGoogleDevice=false).code */
      val SHARK = "spec:width=1080,height=2160,unit=px,dpi=420"

      /** DeviceSpec(manufacturer=blackshark, code=skywalker, width=1080, height=2340, dpi=440,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=blackshark, code=skywalker,
      width=1080, height=2340, dpi=440, isGoogleDevice=false).code */
      val SKYWALKER = "spec:width=1080,height=2340,unit=px,dpi=440"

  }
