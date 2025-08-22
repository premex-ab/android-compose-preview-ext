package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VALIFONE device specifications for Android Compose previews.
 *
 * This extension provides VALIFONE device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Valifone.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Valifone: Any
  get() = object {
      /** VALIFONE V200 */
      val V200 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VALIFONE V710 */
      val V710 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VALIFONE V730 */
      val V730 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** VALIFONE W888 */
      val W888 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
