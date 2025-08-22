package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Sonim device specifications for Android Compose previews.
 *
 * This extension provides Sonim device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Sonim.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Sonim: Any
  get() = object {
      /** Sonim RS60 */
      val RS60 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Sonim RS80 */
      val RS80 = "spec:width=1200,height=1920,unit=px,dpi=480"

      /** Sonim X400 */
      val X400 = "spec:width=720,height=1612,unit=px,dpi=280"

      /** Sonim X800 */
      val X800 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Sonim X801 */
      val X801 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Sonim X802 */
      val X802 = "spec:width=1080,height=2408,unit=px,dpi=480"

      /** Sonim XP6700 */
      val XP6700 = "spec:width=320,height=432,unit=px,dpi=160"

      /** Sonim XP6700Z1 */
      val XP6700Z1 = "spec:width=320,height=432,unit=px,dpi=160"

      /** Sonim XP7700 */
      val XP7700 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Sonim XP7700Z1 */
      val XP7700Z1 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Sonim XP8800 */
      val XP8800 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** Sonim XP9900 */
      val XP9900 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
