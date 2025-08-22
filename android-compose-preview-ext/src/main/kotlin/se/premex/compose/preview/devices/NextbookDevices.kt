package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Nextbook device specifications for Android Compose previews.
 *
 * This extension provides Nextbook device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nextbook.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nextbook: Any
  get() = object {
      /** Nextbook NXM865FD */
      val NXM865FD = "spec:width=768,height=1024,unit=px,dpi=160"

  }
