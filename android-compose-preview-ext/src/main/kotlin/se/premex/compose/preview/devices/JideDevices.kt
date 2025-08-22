package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Jide device specifications for Android Compose previews.
 *
 * This extension provides Jide device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jide.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jide: Any
  get() = object {
      /** Jide rm1g */
      val RM1G = "spec:width=1080,height=2220,unit=px,dpi=440"

  }
