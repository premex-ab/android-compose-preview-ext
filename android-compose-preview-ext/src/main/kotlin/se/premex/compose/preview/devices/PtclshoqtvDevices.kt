package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * PTCLSHOQTV device specifications for Android Compose previews.
 *
 * This extension provides PTCLSHOQTV device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ptclshoqtv.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ptclshoqtv: Any
  get() = object {
      /** PTCLSHOQTV PTCLBox_B866V2F */
      val PTCLBOX_B866V2F = "spec:width=720,height=1280,unit=px,dpi=213"

  }
