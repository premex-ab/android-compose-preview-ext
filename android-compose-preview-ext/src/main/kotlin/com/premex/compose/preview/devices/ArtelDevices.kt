package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARTEL device specifications for Android Compose previews.
 *
 * This extension provides ARTEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Artel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Artel: Any
  get() = object {
      /** ARTEL R1 */
      val R1 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ARTEL R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARTEL R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ARTEL R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ARTEL R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARTEL R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ARTEL U2 */
      val U2 = "spec:width=480,height=960,unit=px,dpi=240"

  }
