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
      /** hp almond */
      val ALMOND = "spec:width=800,height=1280,unit=px,dpi=213"

      /** hp anderson_gw */
      val ANDERSON_GW = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** hp birch */
      val BIRCH = "spec:width=800,height=1280,unit=px,dpi=213"

      /** hp bonsai10 */
      val BONSAI10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** hp bulldog */
      val BULLDOG = "spec:width=800,height=1280,unit=px,dpi=160"

      /** hp franky */
      val FRANKY = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** hp hound */
      val HOUND = "spec:width=800,height=1280,unit=px,dpi=160"

      /** hp klondike */
      val KLONDIKE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** hp malamute */
      val MALAMUTE = "spec:width=1536,height=2048,unit=px,dpi=320"

      /** hp maple */
      val MAPLE = "spec:width=768,height=1024,unit=px,dpi=160"

      /** hp Mesquite */
      val MESQUITE = "spec:width=552,height=1024,unit=px,dpi=160"

      /** hp napa_gw */
      val NAPA_GW = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** hp neetu */
      val NEETU = "spec:width=800,height=1280,unit=px,dpi=213"

      /** hp phobos */
      val PHOBOS = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** hp pine */
      val PINE = "spec:width=600,height=976,unit=px,dpi=160"

      /** hp poodle */
      val POODLE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** hp ranger */
      val RANGER = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** hp redwood */
      val REDWOOD = "spec:width=720,height=1280,unit=px,dpi=160"

      /** hp spruce */
      val SPRUCE = "spec:width=800,height=1280,unit=px,dpi=160"

      /** hp torsa */
      val TORSA = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** hp 3645 */
      val _3645 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
