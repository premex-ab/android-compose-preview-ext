package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * CHOFSLIA device specifications for Android Compose previews.
 *
 * This extension provides CHOFSLIA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Chofslia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Chofslia: Any
  get() = object {
      /** CHOFSLIA A6 */
      val A6 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
