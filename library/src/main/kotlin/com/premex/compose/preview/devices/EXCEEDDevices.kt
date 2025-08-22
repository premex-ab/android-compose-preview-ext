package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EXCEED device specifications for Android Compose previews.
 *
 * This extension provides EXCEED device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.EXCEED.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.EXCEED: Any
  get() = object {
      /** EXCEED E10G22 */
      val E10G22 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** EXCEED E10W10 */
      val E10W10 = "spec:width=800,height=1280,unit=px,dpi=180"

      /** EXCEED EX10S10 */
      val EX10S10 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** EXCEED EX10S4 */
      val EX10S4 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** EXCEED EX7S4 */
      val EX7S4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXCEED EX7SL4 */
      val EX7SL4 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** EXCEED EX7W1S */
      val EX7W1S = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXCEED EX7W4 */
      val EX7W4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXCEED EX7X4 */
      val EX7X4 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** EXCEED EX8S1 */
      val EX8S1 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
