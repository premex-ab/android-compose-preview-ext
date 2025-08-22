package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HIKING device specifications for Android Compose previews.
 *
 * This extension provides HIKING device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HIKING.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HIKING: Any
  get() = object {
      /** HIKING A19 */
      val A19 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** HIKING A20 */
      val A20 = "spec:width=600,height=1280,unit=px,dpi=240"

      /** HIKING A21 */
      val A21 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** HIKING A22 */
      val A22 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** HIKING A23 */
      val A23 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** HIKING A26 */
      val A26 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** HIKING A27 */
      val A27 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** HIKING A28 */
      val A28 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** HIKING A30 */
      val A30 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** HIKING A40 */
      val A40 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HIKING A42 */
      val A42 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HIKING A45 */
      val A45 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** HIKING A55 */
      val A55 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
