package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Urovo device specifications for Android Compose previews.
 *
 * This extension provides Urovo device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Urovo.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Urovo: Any
  get() = object {
      /** Urovo DT40 */
      val DT40 = "spec:width=480,height=800,unit=px,dpi=240"

      /** Urovo DT50 */
      val DT50 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** Urovo i6310 */
      val I6310 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Urovo i9000S */
      val I9000S = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Urovo P8100 */
      val P8100 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Urovo P8100P */
      val P8100P = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Urovo RT40S */
      val RT40S = "spec:width=480,height=800,unit=px,dpi=240"

      /** Urovo SQ46M */
      val SQ46M = "spec:width=480,height=800,unit=px,dpi=200"

      /** Urovo SQ47 */
      val SQ47 = "spec:width=480,height=800,unit=px,dpi=240"

  }
