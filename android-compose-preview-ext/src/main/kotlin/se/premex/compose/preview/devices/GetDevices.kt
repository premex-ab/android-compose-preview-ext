package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Get device specifications for Android Compose previews.
 *
 * This extension provides Get device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Get.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Get: Any
  get() = object {
      /** Get dciw387get */
      val DCIW387GET = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
