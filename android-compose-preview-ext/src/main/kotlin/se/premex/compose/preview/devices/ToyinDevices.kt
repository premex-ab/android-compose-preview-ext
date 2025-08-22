package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * TOYIN device specifications for Android Compose previews.
 *
 * This extension provides TOYIN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Toyin.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Toyin: Any
  get() = object {
      /** TOYIN RJ_TOYIN */
      val RJ_TOYIN = "spec:width=480,height=854,unit=px,dpi=240"

  }
