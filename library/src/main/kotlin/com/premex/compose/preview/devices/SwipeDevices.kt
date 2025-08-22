package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Swipe device specifications for Android Compose previews.
 *
 * This extension provides Swipe device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Swipe.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Swipe: Any
  get() = object {
      /** Swipe Slate2 */
      val SLATE2 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Swipe Strike */
      val STRIKE = "spec:width=600,height=1024,unit=px,dpi=160"

      /** Swipe Swipe_Slate_3 */
      val SWIPE_SLATE_3 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Swipe Swipe_Slate_3_WiFi */
      val SWIPE_SLATE_3_WIFI = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Swipe Swipe_Strike8 */
      val SWIPE_STRIKE8 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** Swipe Swipe_X1 */
      val SWIPE_X1 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
