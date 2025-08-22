package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Dynalink device specifications for Android Compose previews.
 *
 * This extension provides Dynalink device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dynalink.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dynalink: Any
  get() = object {
      /** Dynalink sti6130d350 */
      val STI6130D350 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Dynalink XNA */
      val XNA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Dynalink YOC */
      val YOC = "spec:width=720,height=1280,unit=px,dpi=320"

  }
