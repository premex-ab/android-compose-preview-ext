package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * xiaomi device specifications for Android Compose previews.
 *
 * This extension provides xiaomi device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Xiaomi.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Xiaomi: Any
  get() = object {
      /** xiaomi axolotl */
      val AXOLOTL = "spec:width=466,height=466,unit=px,dpi=320"

      /** xiaomi axolotlaxie */
      val AXOLOTLAXIE = "spec:width=466,height=466,unit=px,dpi=320"

      /** xiaomi axolotlte */
      val AXOLOTLTE = "spec:width=466,height=466,unit=px,dpi=320"

      /** xiaomi cactus */
      val CACTUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** xiaomi cereus */
      val CEREUS = "spec:width=720,height=1440,unit=px,dpi=320"

      /** xiaomi daisy_sprout */
      val DAISY_SPROUT = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** xiaomi ginkgo */
      val GINKGO = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** xiaomi jasmine_sprout */
      val JASMINE_SPROUT = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** xiaomi lavender */
      val LAVENDER = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** xiaomi lotus */
      val LOTUS = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** xiaomi mido */
      val MIDO = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** xiaomi onc */
      val ONC = "spec:width=720,height=1520,unit=px,dpi=320"

      /** xiaomi sakura */
      val SAKURA = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** xiaomi tiffany */
      val TIFFANY = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** xiaomi tissot_sprout */
      val TISSOT_SPROUT = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** xiaomi ugg */
      val UGG = "spec:width=720,height=1280,unit=px,dpi=320"

      /** xiaomi ugglite */
      val UGGLITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** xiaomi vince */
      val VINCE = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** xiaomi violet */
      val VIOLET = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** xiaomi wayne */
      val WAYNE = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** xiaomi willow */
      val WILLOW = "spec:width=1080,height=2340,unit=px,dpi=440"

      /** xiaomi ysl */
      val YSL = "spec:width=720,height=1440,unit=px,dpi=320"

  }
