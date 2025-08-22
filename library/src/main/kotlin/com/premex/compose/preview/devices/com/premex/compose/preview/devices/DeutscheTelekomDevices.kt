package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DeutscheTelekom device specifications for Android Compose previews.
 *
 * This extension provides DeutscheTelekom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DeutscheTelekom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DeutscheTelekom: Any
  get() = object {
      /** DeviceSpec(manufacturer=DeutscheTelekom, code=CHEETAH, width=1080, height=2436, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DeutscheTelekom, code=CHEETAH,
      width=1080, height=2436, dpi=480, isGoogleDevice=false).code */
      val CHEETAH = "spec:width=1080,height=2436,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DeutscheTelekom, code=Hubbs, width=1200, height=2000, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DeutscheTelekom, code=Hubbs,
      width=1200, height=2000, dpi=240, isGoogleDevice=false).code */
      val HUBBS = "spec:width=1200,height=2000,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DeutscheTelekom, code=Jaguar, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DeutscheTelekom, code=Jaguar,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val JAGUAR = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DeutscheTelekom, code=Leopard, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DeutscheTelekom, code=Leopard,
      width=720, height=1600, dpi=280, isGoogleDevice=false).code */
      val LEOPARD = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DeutscheTelekom, code=Lion, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DeutscheTelekom, code=Lion,
      width=720, height=1640, dpi=280, isGoogleDevice=false).code */
      val LION = "spec:width=720,height=1640,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DeutscheTelekom, code=PUMA, width=1080, height=2408, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DeutscheTelekom, code=PUMA,
      width=1080, height=2408, dpi=480, isGoogleDevice=false).code */
      val PUMA = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DeutscheTelekom, code=Tiger, width=720, height=1640, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DeutscheTelekom, code=Tiger,
      width=720, height=1640, dpi=280, isGoogleDevice=false).code */
      val TIGER = "spec:width=720,height=1640,unit=px,dpi=280"

  }
