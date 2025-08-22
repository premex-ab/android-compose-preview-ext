package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EBOX device specifications for Android Compose previews.
 *
 * This extension provides EBOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ebox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ebox: Any
  get() = object {
      /** EBOX sti6280d391 */
      val STI6280D391 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
