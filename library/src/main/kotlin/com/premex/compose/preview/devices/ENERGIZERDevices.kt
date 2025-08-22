package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ENERGIZER device specifications for Android Compose previews.
 *
 * This extension provides ENERGIZER device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ENERGIZER.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ENERGIZER: Any
  get() = object {
      /** ENERGIZER EnergyE500 */
      val ENERGYE500 = "spec:width=480,height=854,unit=px,dpi=240"

      /** ENERGIZER EnergyE500S_EU */
      val ENERGYE500S_EU = "spec:width=480,height=854,unit=px,dpi=240"

      /** ENERGIZER HARDCASEH500S */
      val HARDCASEH500S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** ENERGIZER PowerMaxP490 */
      val POWERMAXP490 = "spec:width=480,height=960,unit=px,dpi=240"

      /** ENERGIZER PowerMaxP490S_AP */
      val POWERMAXP490S_AP = "spec:width=480,height=960,unit=px,dpi=240"

      /** ENERGIZER PowerMaxP490S_EU */
      val POWERMAXP490S_EU = "spec:width=480,height=960,unit=px,dpi=240"

      /** ENERGIZER PowerMaxP600S */
      val POWERMAXP600S = "spec:width=1080,height=2160,unit=px,dpi=480"

      /** ENERGIZER Ultimate_U710S */
      val ULTIMATE_U710S = "spec:width=1080,height=2244,unit=px,dpi=480"

  }
