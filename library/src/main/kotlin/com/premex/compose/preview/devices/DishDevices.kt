package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Dish device specifications for Android Compose previews.
 *
 * This extension provides Dish device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dish.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dish: Any
  get() = object {
      /** Dish dish_cable_bcm */
      val DISH_CABLE_BCM = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Dish DSH98123 */
      val DSH98123 = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Dish SL104D */
      val SL104D = "spec:width=480,height=960,unit=px,dpi=200"

      /** Dish SL201D */
      val SL201D = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Dish SN339D */
      val SN339D = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Dish SN339D-SMT */
      val SN339D_SMT = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Dish U653DS */
      val U653DS = "spec:width=720,height=1600,unit=px,dpi=280"

      /** Dish U695DS */
      val U695DS = "spec:width=1080,height=2460,unit=px,dpi=400"

  }
