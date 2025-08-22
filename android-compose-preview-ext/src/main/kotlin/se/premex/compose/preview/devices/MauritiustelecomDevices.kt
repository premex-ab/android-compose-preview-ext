package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * MauritiusTelecom device specifications for Android Compose previews.
 *
 * This extension provides MauritiusTelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mauritiustelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mauritiustelecom: Any
  get() = object {
      /** MauritiusTelecom HY44G */
      val HY44G = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
