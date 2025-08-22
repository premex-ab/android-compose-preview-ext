package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Scanfrost device specifications for Android Compose previews.
 *
 * This extension provides Scanfrost device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Scanfrost.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Scanfrost: Any
  get() = object {
      /** Scanfrost marina */
      val MARINA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Scanfrost martin */
      val MARTIN = "spec:width=720,height=1280,unit=px,dpi=213"

  }
