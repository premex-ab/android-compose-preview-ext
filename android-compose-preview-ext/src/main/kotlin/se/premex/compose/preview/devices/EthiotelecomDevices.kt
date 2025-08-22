package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ethiotelecom device specifications for Android Compose previews.
 *
 * This extension provides ethiotelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ethiotelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ethiotelecom: Any
  get() = object {
      /** ethiotelecom ET_B866W11A */
      val ET_B866W11A = "spec:width=720,height=1280,unit=px,dpi=213"

  }
