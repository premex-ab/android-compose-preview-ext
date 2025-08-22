package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * EON device specifications for Android Compose previews.
 *
 * This extension provides EON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Eon.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Eon: Any
  get() = object {
      /** EON DV8945C-KSU */
      val DV8945C_KSU = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
