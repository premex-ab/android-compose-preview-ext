package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * hp device specifications for Android Compose previews.
 *
 * This extension provides hp device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hp: Any
  get() = object {
      /** DeviceSpec(manufacturer=hp, code=almond, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=almond, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val ALMOND = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=hp, code=anderson_gw, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=anderson_gw, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val ANDERSON_GW = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=hp, code=birch, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=birch, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val BIRCH = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=hp, code=bonsai10, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=bonsai10, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BONSAI10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=bulldog, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=bulldog, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val BULLDOG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=franky, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=franky, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val FRANKY = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=hound, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=hound, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val HOUND = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=klondike, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=klondike, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val KLONDIKE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=malamute, width=1536, height=2048, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=malamute, width=1536,
      height=2048, dpi=320, isGoogleDevice=false).code */
      val MALAMUTE = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=hp, code=maple, width=768, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=maple, width=768,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MAPLE = "spec:width=768,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=Mesquite, width=552, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=Mesquite, width=552,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val MESQUITE = "spec:width=552,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=napa_gw, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=napa_gw, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val NAPA_GW = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=hp, code=neetu, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=neetu, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val NEETU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=hp, code=phobos, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=phobos, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val PHOBOS = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=pine, width=600, height=976, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=pine, width=600,
      height=976, dpi=160, isGoogleDevice=false).code */
      val PINE = "spec:width=600,height=976,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=poodle, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=poodle, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val POODLE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=ranger, width=1080, height=1920, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=ranger, width=1080,
      height=1920, dpi=160, isGoogleDevice=false).code */
      val RANGER = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=redwood, width=720, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=redwood, width=720,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=spruce, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=spruce, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val SPRUCE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=hp, code=torsa, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=torsa, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val TORSA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=hp, code=3645, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=hp, code=3645, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val _3645 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
