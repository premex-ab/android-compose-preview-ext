package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TechPad device specifications for Android Compose previews.
 *
 * This extension provides TechPad device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.TechPad.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.TechPad: Any
  get() = object {
      /** TechPad GamePad */
      val GAMEPAD = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad i700 */
      val I700 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad K13 */
      val K13 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** TechPad K13pro */
      val K13PRO = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** TechPad NOTE_4CAM */
      val NOTE_4CAM = "spec:width=600,height=1280,unit=px,dpi=240"

      /** TechPad R10 */
      val R10 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** TechPad S6 */
      val S6 = "spec:width=480,height=960,unit=px,dpi=240"

      /** TechPad TechPad_1032 */
      val TECHPAD_1032 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TechPad TechPad_1032s */
      val TECHPAD_1032S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TechPad TechPad_10Y */
      val TECHPAD_10Y = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad TechPad_10Z */
      val TECHPAD_10Z = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad TechPad_3Gx */
      val TECHPAD_3GX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad TechPad_716 */
      val TECHPAD_716 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad TechPad_9x */
      val TECHPAD_9X = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad Techpad_Kids_7 */
      val TECHPAD_KIDS_7 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** TechPad X7 */
      val X7 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** TechPad Z10 */
      val Z10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** TechPad 1016S */
      val _1016S = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TechPad 1032 */
      val _1032 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** TechPad 816x */
      val _816X = "spec:width=800,height=1280,unit=px,dpi=160"

  }
