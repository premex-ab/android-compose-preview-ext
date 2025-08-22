package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Whitedeer device specifications for Android Compose previews.
 *
 * This extension provides Whitedeer device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Whitedeer.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Whitedeer: Any
  get() = object {
      /** Whitedeer G13 */
      val G13 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
