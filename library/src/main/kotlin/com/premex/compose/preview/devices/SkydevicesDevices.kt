package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SKYDevices device specifications for Android Compose previews.
 *
 * This extension provides SKYDevices device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Skydevices.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Skydevices: Any
  get() = object {
      /** SKYDevices Elite65_Pro */
      val ELITE65_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

      /** SKYDevices Elite_65_Pro */
      val ELITE_65_PRO = "spec:width=720,height=1612,unit=px,dpi=280"

      /** SKYDevices Elite_A63B_Max_B */
      val ELITE_A63B_MAX_B = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SKYDevices Elite_A63CMaxC */
      val ELITE_A63CMAXC = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SKYDevices Elite_A63Max */
      val ELITE_A63MAX = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SKYDevices Elite_A63MUS */
      val ELITE_A63MUS = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SKYDevices Elite_A63_A_MaxA */
      val ELITE_A63_A_MAXA = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SKYDevices Elite_A63_D_Max_D */
      val ELITE_A63_D_MAX_D = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SKYDevices SKY_PADMaxNAL */
      val SKY_PADMAXNAL = "spec:width=800,height=1280,unit=px,dpi=200"

  }
