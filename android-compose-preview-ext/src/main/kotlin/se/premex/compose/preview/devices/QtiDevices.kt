package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * qti device specifications for Android Compose previews.
 *
 * This extension provides qti device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Qti.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Qti: Any
  get() = object {
      /** qti kona */
      val KONA = "spec:width=1080,height=1920,unit=px,dpi=360"

  }
