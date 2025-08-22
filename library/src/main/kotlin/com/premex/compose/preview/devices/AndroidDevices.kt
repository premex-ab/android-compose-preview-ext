package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Android device specifications for Android Compose previews.
 *
 * This extension provides Android device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Android.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Android: Any
  get() = object {
      /** Android nanopc-t4 */
      val NANOPC_T4 = "spec:width=720,height=1200,unit=px,dpi=260"

      /** Android rk322x_box */
      val RK322X_BOX = "spec:width=720,height=1280,unit=px,dpi=160"

      /** Android rk3328_box */
      val RK3328_BOX = "spec:width=1080,height=1920,unit=px,dpi=240"

  }
