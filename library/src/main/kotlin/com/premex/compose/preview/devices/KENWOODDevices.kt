package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * KENWOOD device specifications for Android Compose previews.
 *
 * This extension provides KENWOOD device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.KENWOOD.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.KENWOOD: Any
  get() = object {
      /** KENWOOD hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KENWOOD lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** KENWOOD mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** KENWOOD XP8800 */
      val XP8800 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
