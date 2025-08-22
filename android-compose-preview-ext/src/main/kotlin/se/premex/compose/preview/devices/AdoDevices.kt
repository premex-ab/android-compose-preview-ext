package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * ADO device specifications for Android Compose previews.
 *
 * This extension provides ADO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Ado.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Ado: Any
  get() = object {
      /** ADO DIW377_ALT_DO */
      val DIW377_ALT_DO = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
