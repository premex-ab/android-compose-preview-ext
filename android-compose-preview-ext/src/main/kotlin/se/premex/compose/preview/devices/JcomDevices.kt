package se.premex.compose.preview.devices

import kotlin.Any
import se.premex.compose.preview.Devices

/**
 * JCOM device specifications for Android Compose previews.
 *
 * This extension provides JCOM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Jcom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Jcom: Any
  get() = object {
      /** JCOM sti6260d195 */
      val STI6260D195 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JCOM XA401 */
      val XA401 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** JCOM XA402 */
      val XA402 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
