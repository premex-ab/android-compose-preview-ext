package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Quickline device specifications for Android Compose previews.
 *
 * This extension provides Quickline device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Quickline.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Quickline: Any
  get() = object {
      /** Quickline dciw387 */
      val DCIW387 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
