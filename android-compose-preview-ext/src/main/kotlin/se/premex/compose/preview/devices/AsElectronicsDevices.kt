package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * AS_ELECTRONICS device specifications for Android Compose previews.
 *
 * This extension provides AS_ELECTRONICS device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AsElectronics.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AsElectronics: Any
  get() = object {
      /** AS_ELECTRONICS AS1 */
      val AS1 = "spec:width=720,height=1612,unit=px,dpi=280"

  }
