package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Cisco device specifications for Android Compose previews.
 *
 * This extension provides Cisco device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Cisco.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Cisco: Any
  get() = object {
      /** Cisco CP-DX80 */
      val CP_DX80 = "spec:width=1032,height=1920,unit=px,dpi=160"

      /** Cisco 860 */
      val _860 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
