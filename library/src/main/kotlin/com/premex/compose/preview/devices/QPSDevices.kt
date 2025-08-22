package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * QPS device specifications for Android Compose previews.
 *
 * This extension provides QPS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.QPS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.QPS: Any
  get() = object {
      /** QPS ASIUR_101 */
      val ASIUR_101 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** QPS KID15 */
      val KID15 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** QPS KIDS01 */
      val KIDS01 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** QPS P50 */
      val P50 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** QPS T1 */
      val T1 = "spec:width=1200,height=1920,unit=px,dpi=213"

  }
