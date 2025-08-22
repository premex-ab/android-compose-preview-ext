package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * Bic_Camera device specifications for Android Compose previews.
 *
 * This extension provides Bic_Camera device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BicCamera.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BicCamera: Any
  get() = object {
      /** Bic_Camera Si01BB */
      val SI01BB = "spec:width=768,height=1024,unit=px,dpi=160"

  }
