package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Unihertz device specifications for Android Compose previews.
 *
 * This extension provides Unihertz device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Unihertz.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Unihertz: Any
  get() = object {
      /** Unihertz Atom */
      val ATOM = "spec:width=240,height=432,unit=px,dpi=120"

      /** Unihertz Atom_L */
      val ATOM_L = "spec:width=640,height=1136,unit=px,dpi=300"

      /** Unihertz Atom_XL */
      val ATOM_XL = "spec:width=640,height=1136,unit=px,dpi=300"

      /** Unihertz Jelly2 */
      val JELLY2 = "spec:width=480,height=854,unit=px,dpi=220"

      /** Unihertz Jelly2_JP */
      val JELLY2_JP = "spec:width=480,height=854,unit=px,dpi=220"

      /** Unihertz Jelly_2E */
      val JELLY_2E = "spec:width=480,height=854,unit=px,dpi=220"

      /** Unihertz Jelly_Max */
      val JELLY_MAX = "spec:width=720,height=1520,unit=px,dpi=320"

      /** Unihertz Jelly_Star */
      val JELLY_STAR = "spec:width=480,height=854,unit=px,dpi=220"

      /** Unihertz Luna */
      val LUNA = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Unihertz TANK_01 */
      val TANK_01 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** Unihertz Ticktock */
      val TICKTOCK = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Unihertz TickTock-S */
      val TICKTOCK_S = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** Unihertz Titan */
      val TITAN = "spec:width=1440,height=1440,unit=px,dpi=400"

      /** Unihertz Titan_pocket */
      val TITAN_POCKET = "spec:width=720,height=720,unit=px,dpi=220"

      /** Unihertz Titan_Slim */
      val TITAN_SLIM = "spec:width=768,height=1280,unit=px,dpi=320"

      /** Unihertz UNIA62 */
      val UNIA62 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
