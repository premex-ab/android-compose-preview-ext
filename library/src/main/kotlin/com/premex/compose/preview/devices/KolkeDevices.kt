package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Kolke device specifications for Android Compose previews.
 *
 * This extension provides Kolke device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Kolke.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Kolke: Any
  get() = object {
      /** Kolke KTK-611 */
      val KTK_611 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
